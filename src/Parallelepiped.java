public class Parallelepiped {

    private double length;
    private double width;
    private double height;

    public Parallelepiped() {
    }

    public Parallelepiped(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) throws SquareException {
        if (length <= 0) {
            throw new SquareException("Berilgen san ters san bolso");
        }
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) throws SquareException {
        if(width == Integer.parseInt("10")){
            throw new SquareException("Berilgen maalymat san emes tamga bolso");
        }
        this.width = width;
    }

    public double getHeight (){
            return height;
        }

        public void setHeight ( double height) throws SquareException {
            if (height >= 20) {
                throw new SquareException("Berilgen sandar 20 dan chon bolso");
            }
            this.height = height;
        }
        public double getSquare() {
            return 2 * ((height * height) + (length * width) + (height * width));

        }
        public double getVolume() {
            return (length * width * height);
        }
    }
