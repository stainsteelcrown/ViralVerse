/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package services;


/**
 *
 * @author Andrew
 */
public class Factory {
    public IService getService(String serviceName) throws ServiceLoadException
    {
        try
        {
            Class c = Class.forName(getImplName(serviceName));
            return (IService)c.newInstance();
        }catch(Exception e)
        {
            throw new ServiceLoadException(serviceName + "not loaded");
        }
        
    }

  private String getImplName(String name) throws Exception
    {
      java.util.Properties props = new java.util.Properties();
      java.io.FileInputStream fis= new java.io.FileInputStream("properties.txt");
      props.load(fis);
      fis.close();
      return props.getProperty(name);

    }
  }

