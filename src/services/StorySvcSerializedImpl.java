/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package services;
import domain.Story;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Andrew
 */
public class StorySvcSerializedImpl implements IStorySvc {

    private String filename = "TrueStory.txt";

    public Story store(Story c){
        try {
            ObjectOutputStream output1 = new ObjectOutputStream(
                    new FileOutputStream(filename));
            output1.writeObject(c);
            output1.flush();
            output1.close();
            } catch (IOException ex) {
                ex.printStackTrace();
        }
        return c;
    }
        
    public List retrieve (Story r) {
        Story story = new Story();
        List<Story> stories = new ArrayList<Story>();
        try{
            ObjectInputStream input1 = new ObjectInputStream (new FileInputStream(filename));
            story = (Story)input1.readObject();
            stories.add(story);
            input1.close();
        } catch (Exception ex){
            ex.printStackTrace();
        }
        return stories;
    }

    public Story update(Story u){
        //not yet implemented
        return null;
    }

    public Story delete(Story d) {
                Story storyDelete = null;
        try{
            ObjectOutputStream output2 = new ObjectOutputStream(new FileOutputStream(filename));
            output2.writeObject(storyDelete);
            output2.flush();
            output2.close();
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return storyDelete;
    }

    public List retrieve(String search) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
