/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package services;

import domain.*;
import java.util.List;

/**
 *
 * @author Andrew
 */
public interface IStorySvc extends IService {

    public final String NAME = "IStorySvc";

    public Story store (Story c);
    public List retrieve (Story r);
    public List retrieve (String search);
    public Story update (Story update);
    public Story delete (Story d);

}
