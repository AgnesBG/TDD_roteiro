class Dollar extends Money {
   //int amount;
   Dollar(int amount) {
      this.amount= amount;
   }
   Money times(int multiplier) {
       return new Dollar(amount * multiplier);
      //amount = amount * multiplier;
   }
   //public boolean equals(Object object)  {
   //    Dollar dollar = (Dollar) object;
   //    return amount == dollar.amount;
   //}
}