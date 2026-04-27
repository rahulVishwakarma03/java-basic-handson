// Money.java
class Money{
  final int value;
  Money(int value){
    this.value = value;
  }

  Money add(Money amt){
    int actual = this.value + amt.value;
    return new Money(actual);
  }
  
  Money minus(Money amt){
    int actual = this.value - amt.value;
    return new Money(actual);
  }
}