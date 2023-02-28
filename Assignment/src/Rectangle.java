public class Rectangle implements Shape {

    private int rectangle_width;
    private int rectangle_height;

    @Override
    public void setWidthOfShape(int widthOfShape) {
        rectangle_width = widthOfShape;
    }

    public void setHeightofShape(int heightOfshape) {
        rectangle_height = heightOfshape;
    }


    @Override
    public int getArea() {
        return rectangle_width * rectangle_height;
    }
}
