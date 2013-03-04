/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package domain;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author andrew
 */
public class Story {

    private String characterOne;

    public void setCharacterOne(String line){
        characterOne = line;
    }

    public String getCharacterOne(){
        return characterOne;
    }

    private String characterTwo;

    public void setCharacterTwo(String line){
        characterTwo = line;
    }

    public String getCharacterTwo(){
        return characterTwo;
    }

    private String firstLine;

    public void setFirstLine(String line){
        firstLine = line;
        addStoryLine(1,line);
    }

    public String getFirstLine(){
        return firstLine;
    }

    private String premise;

    public void setPremise(String line){
        premise = line;
    }

    public String getPremise(){
        return premise;
    }


    private Map<Integer, String> storyLines = new HashMap<Integer, String>();

    public void addStoryLine(Integer key, String value){
        storyLines.put(key, value);
    }

    public String getStoryLine(Integer key){
        String value;
        if(storyLines.containsKey(key)){
            value = storyLines.get(key);
            return value;
        }
        return "";
    }

}
