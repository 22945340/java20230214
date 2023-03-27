package ch07.lecture.p07sealed;

public class C02Sealed {

}

sealed class Super02 permits Sub021{}

sealed class Sub021 extends Super02 permits Sub0211{}

final class Sub0211 extends Sub021{}
