1.  Predicate
    * **(T) -> boolean**
    - IntPredicate
    - LongPredicate
    - DoublePredicate
    
2.  Consumer
    * **(T) -> void**
    - IntConsumer<Integer>
    - LongConsumer<Long>
    - DoubleConsumer<Long>
    
3.  Function
    * **(T) -> R**
     - IntFunction<R>
     - LongFunction <R>
     - DoubleFunction <R>
     
     - ToIntFunction<T>
     - ToLongFunction<T>
     - ToDoubleFunction<T>
     
     - IntToLongFunction
     - IntToDoubleFunction
     - LongToIntFunction
     - LongToDoubleFunction
     - DoubleToIntFunction
     - DoubleToLongFunction
     
4.  Supplier
    * **( ) -> T**
     - BooleanSupplier
     - IntSupplier
     - LongSupplier
     - DoubleSupplier
      
5.  Unary Operator
    * **(T) -> (T)**
    - IntUnaryOperator
    - LongUnaryOperator
    - DoubleOperator
    
6.  BiPredicate
    * **(T,U) -> boolean**
    
7.  BiConsumer
    * **(T,U) -> void**
    
8.  BiFunction
    * **(T,U) -> R**
    
9.  BiSupplier
    * **(T,U) -> void**
    
10. Binary Operator
    * **(T,T) -> T**
