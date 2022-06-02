package Lesson1.CodeReview;

// наследуется от класса Car, не указан implements от инферфейсов Moveable и Stopable
/*class Lorry extends Car implements Moveable, Stopable {

    //не указана анотация Override (не обязательно, но улучшается читаемость кода)
    @Override
    public void move(){
        System.out.println("Car is moving");
    }
    //не указана анотация Override (не обязательно, но улучшается читаемость кода)
    @Override
    public void stop(){
        System.out.println("Car is stop");
    }

    // не реализован метод родительского класса
    @Override
    public void start() {
        super.start();
    }

    // не реализован абстрактный метод
    @Override
    void open() {

    }
}

 */
