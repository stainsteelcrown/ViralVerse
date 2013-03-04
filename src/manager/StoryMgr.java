/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package manager;
import domain.*;
import java.util.ArrayList;
import java.util.List;
import services.*;

/**
 *
 * @author Andrew
 */
public class StoryMgr extends Manager{

    public Story create(Story contact) throws ServiceLoadException{
        IStorySvc storySvc = (IStorySvc)getService(IStorySvc.NAME);
        storySvc.store(contact);
        return contact;
    }

    public List retrieve(Story retrieve) throws ServiceLoadException{
        IStorySvc storySvc = (IStorySvc)getService(IStorySvc.NAME);
        List<Story> contacts = new ArrayList<Story>();
        contacts = storySvc.retrieve(retrieve);
        return contacts;
    }

    public List retrieve(String search) throws ServiceLoadException{
        IStorySvc storySvc = (IStorySvc)getService(IStorySvc.NAME);
        List<Story> contacts = new ArrayList<Story>();
        contacts = storySvc.retrieve(search);
        return contacts;
    }

    public Story update(Story update) throws ServiceLoadException{
        IStorySvc storySvc = (IStorySvc)getService(IStorySvc.NAME);
        update = storySvc.update(update);
        return update;
    }

    public Story delete(Story d) throws ServiceLoadException{
        IStorySvc storySvc = (IStorySvc)getService(IStorySvc.NAME);
        d = storySvc.delete(d);
        return d;
    }
}
