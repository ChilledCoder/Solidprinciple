public class Square implements Shape {

    int square_width;
    int square_height;


    public void setWidthOfShape(int widthOfShape) {
        square_width = widthOfShape;
        square_height = widthOfShape;
    }

    public void setHeightofShape(int heightOfshape) {
        square_width = heightOfshape;
        square_height = heightOfshape;
    }

    @Override
    public int getArea() {
        return square_width * square_height;
    }
}
