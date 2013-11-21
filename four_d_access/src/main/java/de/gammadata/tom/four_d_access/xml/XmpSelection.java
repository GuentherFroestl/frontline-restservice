/*
 * XmpSelection.java
 *
 * Created on 18. Januar 2005, 15:27
 */

package de.gammadata.tom.four_d_access.xml;

import java.util.ArrayList;

/**
 *
 * @author  gfr
 */
public  class XmpSelection 
{
    private Class contentClass=null;
    private int recordsInDbSelecton=0;
    private int displayedRecs=0;
    private int displaySize=20;
    private int firstDisplayedRecNr=0;
    private int lastDisplayedRecNr=0;
    private int nextFirstdisplayedRecNr=0;
    private int nextLastDisplayedRecNr=0;
    private String scope="";
    private String name="";
    
    private ArrayList<Xmp> selection;
    private int currentRecordNr=0;
    private boolean isReloaded = false;

    private boolean reverseOrder=false;
    

    
    public XmpSelection()
    {
        selection = new ArrayList<Xmp>();
    }
    
    public XmpSelection(Class inp)
    {
        contentClass=inp;
        selection = new ArrayList<Xmp>();
    }
    
    
    
    public void setContentClass(Class inp)
    {
        contentClass = inp;
    }
    public Class getContentClass()
    {
        return contentClass;
    }
    
    public void setScope(String inp)
    {
        scope = inp;
    }
    public String getScope()
    {
        return scope;
    }
    public void setName(String inp)
    {
        name = inp;
    }
    public String getName()
    {
        return name;
    }
    
    public void setReloaded(boolean inp)
    {
        isReloaded=inp;
    }
    public boolean isReloaded()
    {
        return isReloaded;
    }
    public void setRecordsInDbSelecton(int inp)
    {
        recordsInDbSelecton= inp;
    }
    public int getRecordsInDbSelecton()
    {
        return recordsInDbSelecton;
    }
    
    public void setDisplayedRecs(int inp)
    {
        displayedRecs= inp;
    }
    public int getDisplayedRecs()
    {
        return displayedRecs;
    }
    
    public void setDisplaySize(int inp)
    {
        displaySize= inp;
    }
    public int getDisplaySize()
    {
        return displaySize;
    }
    
    public void setFirstDisplayedRecNr(int inp)
    {
        firstDisplayedRecNr= inp;
    }
    public int getFirstDisplayedRecNr()
    {
        return firstDisplayedRecNr;
    }
    
    public int getLastDisplayedRecNr()
    {
        if (getListSize()>0)
        {
         return firstDisplayedRecNr+getListSize()-1;
        }
        else
        {
            return firstDisplayedRecNr;
        }
    }
    
    public boolean isLastRecDisplayed()
    {
        if (getLastDisplayedRecNr()>=getRecordsInDbSelecton())
            return true;
        return false;
    }
    
    public int getNextFirstDisplayedRecNr()
    {
        if (!isLastRecDisplayed()) return getLastDisplayedRecNr()+1;
        else
        {
            return getFirstDisplayedRecNr();
        }
    }
    
    public int getNextLastDisplayedRecNr()
    {
        if (!isLastRecDisplayed())
        {
            if (getLastDisplayedRecNr()+getDisplayedRecs()<=getRecordsInDbSelecton())
            {
                return getLastDisplayedRecNr()+getDisplayedRecs();
            }
            else
            {
                return getRecordsInDbSelecton();
            }
        }
        else
        {
            return getLastDisplayedRecNr();
        }
    }
    
    
    public int getPrevFirstDisplayedRecNr()
    {
        if (isFirstRecDisplayed()) return getFirstDisplayedRecNr();
        else
        {
            if (getFirstDisplayedRecNr()-getDisplayedRecs()<=1) return(1);
            return getFirstDisplayedRecNr()-getDisplayedRecs();
        }
    }
    
    public boolean isFirstRecDisplayed()
    {
        if (getFirstDisplayedRecNr()<=1) return true;
        return false;
    }
    
    public ArrayList<Xmp> getSelection()
    {
        return selection;
    }
    
    public void addToSelection(Xmp inpObj)
    {
        selection.add(inpObj);
    }
    public void addXmpObject(Xmp inpObj)
    {
        selection.add(inpObj);
    }
    public void setSelection (ArrayList<Xmp> inp)
    {
        selection = inp;
    }
    
    public int getListSize()
    {
        return selection.size();
    }
    public int getSize()
    {
        return selection.size();
    }
    
    public void setCurrentRecordNr(int pos)
    {
        if ((selection.size()>0)&&(pos<selection.size()))
        {
            currentRecordNr=pos;
        }
    }
    public int getCurrentRecordNr()
    {
        return currentRecordNr;
    }
    
    public Xmp getSelectedObject()
    {
        Xmp obj=null;
        if ((selection.size()>0)&&(this.getCurrentRecordNr()<selection.size())&&(this.getCurrentRecordNr()>0))
        {
            return (Xmp)selection.get(this.getCurrentRecordNr());
        }
        else 
        {
            return null;
        }
        
    }
    
    public Xmp getSelectedObject(int pos)
    {
        if ((selection.size()>0)&&(pos<selection.size())&&(pos>=0))
        {
            return (Xmp)selection.get(pos);
        }
        else 
        {
            return null;
        } 
    }
    
    public Xmp getXmpObject(int pos)
    {
        if ((selection.size()>0)&&(pos<selection.size())&&(pos>=0))
        {
            return (Xmp)selection.get(pos);
        }
        else 
        {
            return null;
        } 
    }
    
    public Xmp removeXmpObject(int pos)
    {
        if ((selection.size()>0)&&(pos<selection.size())&&(pos>=0))
        {
            return (Xmp)selection.remove(pos);
        }
        else 
        {
            return null;
        } 
    }
    
    public Xmp removeXmpObjectbyDid(int did)
    {
        int pos = indexByDID(did);
        if ((selection.size()>0)&&(pos<selection.size())&&(pos>=0))
        {
            return (Xmp)selection.remove(pos);
        }
        else 
        {
            return null;
        } 
    }

//    public void setStoredQuery(StoredQuery storedQuery)
//    {
//        this.storedQuery = storedQuery;
//    }
//    
//    public StoredQuery getStoredQuery()
//    {
//        return this.storedQuery;
//    }
//    
    public int indexByDID(int did)
    {
        int pos=-1;
        for(int i=0;i<selection.size();i++)
        {
            if (((Xmp)selection.get(i)).getDID()==did)
            {
                pos= i;
                break;
            }
        }
        return pos;
    }
}

