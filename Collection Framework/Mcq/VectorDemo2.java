package com.kiran.Mcq;

import java.util.*;
class VectorDemo2 
{
  public static void main(String args[]) 
  {
    Vector obj = new Vector(4,2);
    obj.addElement(new Integer(3));
    obj.addElement(new Integer(2));
    obj.addElement(new Integer(6));
    obj.insertElementAt(new Integer(8), 2);
    System.out.println(obj);
  } 
}