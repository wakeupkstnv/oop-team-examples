package factory_method.shapes;

public class ShapesFactory {
    public Shape getShape(ShapesEnum shapesType){
        if (shapesType.equals(ShapesEnum.CIRCLE))
            return new Circle();
        if (shapesType.equals(ShapesEnum.RECTANGLE))
            return new Rectangle();
        if (shapesType.equals(ShapesEnum.SQUARE))
            return new Square();
        return null;
    }
}
