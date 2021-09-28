package com.sel;

public class DragAndDrop extends BaseClass {
public static void main(String[] args) {
	Browser("http://demo.guru99.com/test/drag_drop.html");
	DragPage d=new DragPage();
	dragAndDrop(d.getSource(),d.getTarget());	
}
}
