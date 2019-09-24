### About

This project is based on https://github.com/eugenp/tutorials/tree/master/performance-tests from Baeldung. 
I just added Selma and updated versions.

Benchmark results on my computer (throughput), sorted from best to worst:

    Framework      Score     Units
    MapStruct      7572.877  ops/ms
    Selma          5799.140  ops/ms
    JMapper        4203.388  ops/ms
    Orika          185.148   ops/ms
    ModelMapper    24.155    ops/ms
    Dozer          12.833    ops/ms


### Briliant article from Baeldung with more information (just currently without Selma): 

- [Performance of Java Mapping Frameworks](http://www.baeldung.com/java-performance-mapping-frameworks)

### Running

 To run the performance benchmarks:

1: `mvn clean package`   
2: `java -jar target/benchmarks.jar`

... Just go for a long walk, it will take about an hour to complete