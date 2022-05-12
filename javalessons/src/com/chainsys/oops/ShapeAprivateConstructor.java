package com.chainsys.oops;

public class ShapeAprivateConstructor {
	public int height;
	public int width;
	
	private ShapeAprivateConstructor() {
		System.out.println("ShapeA created A"+ hashCode());
	}
	private ShapeAprivateConstructor(int x) {
		height=x;
		width=x;
		System.out.println("ShapeA created B"+ hashCode());
	}
	public static ShapeAprivateConstructor getobject() {
		return new ShapeAprivateConstructor();
	}
	public void echo() {
		System.out.println("Shape A echo..");
		System.out.println(height+" "+ width);
	}
	public static void testPrivateConstructor() {
		ShapeAprivateConstructor refShapeA=
				ShapeAprivateConstructor.getobject();
		refShapeA.height=123;
		refShapeA.width=500;
		refShapeA.echo();
	}

}
