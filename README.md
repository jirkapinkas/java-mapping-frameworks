### About

This project is based on https://github.com/eugenp/tutorials/tree/master/performance-tests from Baeldung. 
I just added Selma and updated versions.

Benchmark results on my computer (throughput), sorted from best to worst (higher number is better):

    Framework      Score     Units
    MapStruct      7634.515   ops/ms
    Selma          5656.606   ops/ms
    JMapper        5563.680   ops/ms
    Orika           262.515   ops/ms
    Dozer            17.077   ops/ms
    ModelMapper      16.286   ops/ms


### Briliant article from Baeldung with more information (just currently without Selma): 

- [Performance of Java Mapping Frameworks](http://www.baeldung.com/java-performance-mapping-frameworks)

### Running

 To run the performance benchmarks:

1: `mvn clean package`   
2: `java -jar target/benchmarks.jar`

... Just go for a long walk, it will take about an hour to complete


### Whole benchmark results:

    Benchmark                                                                             Mode      Cnt       Score       Error   Units
    MappingFrameworksPerformance.realLifeTest                                            thrpt        5   19150.679 ±   993.356  ops/ms
    MappingFrameworksPerformance.realLifeTest:dozerMapperRealLifeBenchmark               thrpt        5      17.077 ±     1.410  ops/ms
    MappingFrameworksPerformance.realLifeTest:jmapperRealLifeBenchmark                   thrpt        5    5563.680 ±   711.877  ops/ms
    MappingFrameworksPerformance.realLifeTest:mapStructRealLifeMapperBenchmark           thrpt        5    7634.515 ±  1976.421  ops/ms
    MappingFrameworksPerformance.realLifeTest:modelMapperRealLifeBenchmark               thrpt        5      16.286 ±     0.307  ops/ms
    MappingFrameworksPerformance.realLifeTest:orikaMapperRealLifeBenchmark               thrpt        5     262.515 ±    48.079  ops/ms
    MappingFrameworksPerformance.realLifeTest:selmaRealLifeMapperBenchmark               thrpt        5    5656.606 ±  1002.009  ops/ms
    MappingFrameworksPerformance.simpleTest                                              thrpt        5  403526.105 ± 65853.275  ops/ms
    MappingFrameworksPerformance.simpleTest:dozerMapperSimpleBenchmark                   thrpt        5     837.885 ±   140.288  ops/ms
    MappingFrameworksPerformance.simpleTest:jmapperSimpleBenchmark                       thrpt        5  136443.790 ± 37910.421  ops/ms
    MappingFrameworksPerformance.simpleTest:mapStructMapperSimpleBenchmark               thrpt        5  129068.108 ± 22154.122  ops/ms
    MappingFrameworksPerformance.simpleTest:modelMapperBenchmark                         thrpt        5     941.476 ±   133.959  ops/ms
    MappingFrameworksPerformance.simpleTest:orikaMapperSimpleBenchmark                   thrpt        5    2665.658 ±   393.816  ops/ms
    MappingFrameworksPerformance.simpleTest:selmaMapperSimpleBenchmark                   thrpt        5  133569.188 ± 40923.697  ops/ms
    MappingFrameworksPerformance.realLifeTest                                             avgt        5       0.022 ±     0.001   ms/op
    MappingFrameworksPerformance.realLifeTest:dozerMapperRealLifeBenchmark                avgt        5       0.059 ±     0.004   ms/op
    MappingFrameworksPerformance.realLifeTest:jmapperRealLifeBenchmark                    avgt        5      ≈ 10⁻⁴               ms/op
    MappingFrameworksPerformance.realLifeTest:mapStructRealLifeMapperBenchmark            avgt        5      ≈ 10⁻⁴               ms/op
    MappingFrameworksPerformance.realLifeTest:modelMapperRealLifeBenchmark                avgt        5       0.071 ±     0.008   ms/op
    MappingFrameworksPerformance.realLifeTest:orikaMapperRealLifeBenchmark                avgt        5       0.004 ±     0.001   ms/op
    MappingFrameworksPerformance.realLifeTest:selmaRealLifeMapperBenchmark                avgt        5      ≈ 10⁻⁴               ms/op
    MappingFrameworksPerformance.simpleTest                                               avgt        5      ≈ 10⁻³               ms/op
    MappingFrameworksPerformance.simpleTest:dozerMapperSimpleBenchmark                    avgt        5       0.001 ±     0.001   ms/op
    MappingFrameworksPerformance.simpleTest:jmapperSimpleBenchmark                        avgt        5      ≈ 10⁻⁵               ms/op
    MappingFrameworksPerformance.simpleTest:mapStructMapperSimpleBenchmark                avgt        5      ≈ 10⁻⁵               ms/op
    MappingFrameworksPerformance.simpleTest:modelMapperBenchmark                          avgt        5       0.001 ±     0.001   ms/op
    MappingFrameworksPerformance.simpleTest:orikaMapperSimpleBenchmark                    avgt        5      ≈ 10⁻³               ms/op
    MappingFrameworksPerformance.simpleTest:selmaMapperSimpleBenchmark                    avgt        5      ≈ 10⁻⁵               ms/op
    MappingFrameworksPerformance.realLifeTest                                           sample  7102269       0.015 ±     0.001   ms/op
    MappingFrameworksPerformance.realLifeTest:dozerMapperRealLifeBenchmark              sample   807270       0.062 ±     0.001   ms/op
    MappingFrameworksPerformance.realLifeTest:dozerMapperRealLifeBenchmark·p0.00        sample                0.039               ms/op
    MappingFrameworksPerformance.realLifeTest:dozerMapperRealLifeBenchmark·p0.50        sample                0.062               ms/op
    MappingFrameworksPerformance.realLifeTest:dozerMapperRealLifeBenchmark·p0.90        sample                0.066               ms/op
    MappingFrameworksPerformance.realLifeTest:dozerMapperRealLifeBenchmark·p0.95        sample                0.067               ms/op
    MappingFrameworksPerformance.realLifeTest:dozerMapperRealLifeBenchmark·p0.99        sample                0.072               ms/op
    MappingFrameworksPerformance.realLifeTest:dozerMapperRealLifeBenchmark·p0.999       sample                0.190               ms/op
    MappingFrameworksPerformance.realLifeTest:dozerMapperRealLifeBenchmark·p0.9999      sample                2.643               ms/op
    MappingFrameworksPerformance.realLifeTest:dozerMapperRealLifeBenchmark·p1.00        sample                6.521               ms/op
    MappingFrameworksPerformance.realLifeTest:jmapperRealLifeBenchmark                  sample  1428854      ≈ 10⁻⁴               ms/op
    MappingFrameworksPerformance.realLifeTest:jmapperRealLifeBenchmark·p0.00            sample               ≈ 10⁻⁴               ms/op
    MappingFrameworksPerformance.realLifeTest:jmapperRealLifeBenchmark·p0.50            sample               ≈ 10⁻⁴               ms/op
    MappingFrameworksPerformance.realLifeTest:jmapperRealLifeBenchmark·p0.90            sample               ≈ 10⁻⁴               ms/op
    MappingFrameworksPerformance.realLifeTest:jmapperRealLifeBenchmark·p0.95            sample               ≈ 10⁻⁴               ms/op
    MappingFrameworksPerformance.realLifeTest:jmapperRealLifeBenchmark·p0.99            sample               ≈ 10⁻³               ms/op
    MappingFrameworksPerformance.realLifeTest:jmapperRealLifeBenchmark·p0.999           sample                0.002               ms/op
    MappingFrameworksPerformance.realLifeTest:jmapperRealLifeBenchmark·p0.9999          sample                0.009               ms/op
    MappingFrameworksPerformance.realLifeTest:jmapperRealLifeBenchmark·p1.00            sample                5.300               ms/op
    MappingFrameworksPerformance.realLifeTest:mapStructRealLifeMapperBenchmark          sample  1339767      ≈ 10⁻⁴               ms/op
    MappingFrameworksPerformance.realLifeTest:mapStructRealLifeMapperBenchmark·p0.00    sample               ≈ 10⁻⁴               ms/op
    MappingFrameworksPerformance.realLifeTest:mapStructRealLifeMapperBenchmark·p0.50    sample               ≈ 10⁻⁴               ms/op
    MappingFrameworksPerformance.realLifeTest:mapStructRealLifeMapperBenchmark·p0.90    sample               ≈ 10⁻⁴               ms/op
    MappingFrameworksPerformance.realLifeTest:mapStructRealLifeMapperBenchmark·p0.95    sample               ≈ 10⁻⁴               ms/op
    MappingFrameworksPerformance.realLifeTest:mapStructRealLifeMapperBenchmark·p0.99    sample               ≈ 10⁻³               ms/op
    MappingFrameworksPerformance.realLifeTest:mapStructRealLifeMapperBenchmark·p0.999   sample                0.002               ms/op
    MappingFrameworksPerformance.realLifeTest:mapStructRealLifeMapperBenchmark·p0.9999  sample                0.008               ms/op
    MappingFrameworksPerformance.realLifeTest:mapStructRealLifeMapperBenchmark·p1.00    sample               10.732               ms/op
    MappingFrameworksPerformance.realLifeTest:modelMapperRealLifeBenchmark              sample   675920       0.074 ±     0.001   ms/op
    MappingFrameworksPerformance.realLifeTest:modelMapperRealLifeBenchmark·p0.00        sample                0.043               ms/op
    MappingFrameworksPerformance.realLifeTest:modelMapperRealLifeBenchmark·p0.50        sample                0.078               ms/op
    MappingFrameworksPerformance.realLifeTest:modelMapperRealLifeBenchmark·p0.90        sample                0.084               ms/op
    MappingFrameworksPerformance.realLifeTest:modelMapperRealLifeBenchmark·p0.95        sample                0.085               ms/op
    MappingFrameworksPerformance.realLifeTest:modelMapperRealLifeBenchmark·p0.99        sample                0.089               ms/op
    MappingFrameworksPerformance.realLifeTest:modelMapperRealLifeBenchmark·p0.999       sample                0.214               ms/op
    MappingFrameworksPerformance.realLifeTest:modelMapperRealLifeBenchmark·p0.9999      sample                2.776               ms/op
    MappingFrameworksPerformance.realLifeTest:modelMapperRealLifeBenchmark·p1.00        sample                6.595               ms/op
    MappingFrameworksPerformance.realLifeTest:orikaMapperRealLifeBenchmark              sample  1724970       0.004 ±     0.001   ms/op
    MappingFrameworksPerformance.realLifeTest:orikaMapperRealLifeBenchmark·p0.00        sample                0.002               ms/op
    MappingFrameworksPerformance.realLifeTest:orikaMapperRealLifeBenchmark·p0.50        sample                0.004               ms/op
    MappingFrameworksPerformance.realLifeTest:orikaMapperRealLifeBenchmark·p0.90        sample                0.004               ms/op
    MappingFrameworksPerformance.realLifeTest:orikaMapperRealLifeBenchmark·p0.95        sample                0.005               ms/op
    MappingFrameworksPerformance.realLifeTest:orikaMapperRealLifeBenchmark·p0.99        sample                0.005               ms/op
    MappingFrameworksPerformance.realLifeTest:orikaMapperRealLifeBenchmark·p0.999       sample                0.010               ms/op
    MappingFrameworksPerformance.realLifeTest:orikaMapperRealLifeBenchmark·p0.9999      sample                0.135               ms/op
    MappingFrameworksPerformance.realLifeTest:orikaMapperRealLifeBenchmark·p1.00        sample                5.333               ms/op
    MappingFrameworksPerformance.realLifeTest:realLifeTest·p0.00                        sample               ≈ 10⁻⁴               ms/op
    MappingFrameworksPerformance.realLifeTest:realLifeTest·p0.50                        sample               ≈ 10⁻⁴               ms/op
    MappingFrameworksPerformance.realLifeTest:realLifeTest·p0.90                        sample                0.065               ms/op
    MappingFrameworksPerformance.realLifeTest:realLifeTest·p0.95                        sample                0.078               ms/op
    MappingFrameworksPerformance.realLifeTest:realLifeTest·p0.99                        sample                0.084               ms/op
    MappingFrameworksPerformance.realLifeTest:realLifeTest·p0.999                       sample                0.091               ms/op
    MappingFrameworksPerformance.realLifeTest:realLifeTest·p0.9999                      sample                1.329               ms/op
    MappingFrameworksPerformance.realLifeTest:realLifeTest·p1.00                        sample               10.732               ms/op
    MappingFrameworksPerformance.realLifeTest:selmaRealLifeMapperBenchmark              sample  1125488      ≈ 10⁻⁴               ms/op
    MappingFrameworksPerformance.realLifeTest:selmaRealLifeMapperBenchmark·p0.00        sample               ≈ 10⁻⁴               ms/op
    MappingFrameworksPerformance.realLifeTest:selmaRealLifeMapperBenchmark·p0.50        sample               ≈ 10⁻⁴               ms/op
    MappingFrameworksPerformance.realLifeTest:selmaRealLifeMapperBenchmark·p0.90        sample               ≈ 10⁻⁴               ms/op
    MappingFrameworksPerformance.realLifeTest:selmaRealLifeMapperBenchmark·p0.95        sample               ≈ 10⁻⁴               ms/op
    MappingFrameworksPerformance.realLifeTest:selmaRealLifeMapperBenchmark·p0.99        sample               ≈ 10⁻³               ms/op
    MappingFrameworksPerformance.realLifeTest:selmaRealLifeMapperBenchmark·p0.999       sample                0.002               ms/op
    MappingFrameworksPerformance.realLifeTest:selmaRealLifeMapperBenchmark·p0.9999      sample                0.011               ms/op
    MappingFrameworksPerformance.realLifeTest:selmaRealLifeMapperBenchmark·p1.00        sample                2.671               ms/op
    MappingFrameworksPerformance.simpleTest                                             sample  8741669      ≈ 10⁻³               ms/op
    MappingFrameworksPerformance.simpleTest:dozerMapperSimpleBenchmark                  sample  1405012       0.001 ±     0.001   ms/op
    MappingFrameworksPerformance.simpleTest:dozerMapperSimpleBenchmark·p0.00            sample                0.001               ms/op
    MappingFrameworksPerformance.simpleTest:dozerMapperSimpleBenchmark·p0.50            sample                0.001               ms/op
    MappingFrameworksPerformance.simpleTest:dozerMapperSimpleBenchmark·p0.90            sample                0.001               ms/op
    MappingFrameworksPerformance.simpleTest:dozerMapperSimpleBenchmark·p0.95            sample                0.001               ms/op
    MappingFrameworksPerformance.simpleTest:dozerMapperSimpleBenchmark·p0.99            sample                0.002               ms/op
    MappingFrameworksPerformance.simpleTest:dozerMapperSimpleBenchmark·p0.999           sample                0.005               ms/op
    MappingFrameworksPerformance.simpleTest:dozerMapperSimpleBenchmark·p0.9999          sample                0.085               ms/op
    MappingFrameworksPerformance.simpleTest:dozerMapperSimpleBenchmark·p1.00            sample                4.637               ms/op
    MappingFrameworksPerformance.simpleTest:jmapperSimpleBenchmark                      sample  1659872      ≈ 10⁻⁴               ms/op
    MappingFrameworksPerformance.simpleTest:jmapperSimpleBenchmark·p0.00                sample               ≈ 10⁻⁵               ms/op
    MappingFrameworksPerformance.simpleTest:jmapperSimpleBenchmark·p0.50                sample               ≈ 10⁻⁴               ms/op
    MappingFrameworksPerformance.simpleTest:jmapperSimpleBenchmark·p0.90                sample               ≈ 10⁻⁴               ms/op
    MappingFrameworksPerformance.simpleTest:jmapperSimpleBenchmark·p0.95                sample               ≈ 10⁻⁴               ms/op
    MappingFrameworksPerformance.simpleTest:jmapperSimpleBenchmark·p0.99                sample               ≈ 10⁻⁴               ms/op
    MappingFrameworksPerformance.simpleTest:jmapperSimpleBenchmark·p0.999               sample               ≈ 10⁻⁴               ms/op
    MappingFrameworksPerformance.simpleTest:jmapperSimpleBenchmark·p0.9999              sample                0.001               ms/op
    MappingFrameworksPerformance.simpleTest:jmapperSimpleBenchmark·p1.00                sample                2.079               ms/op
    MappingFrameworksPerformance.simpleTest:mapStructMapperSimpleBenchmark              sample  1690992      ≈ 10⁻⁴               ms/op
    MappingFrameworksPerformance.simpleTest:mapStructMapperSimpleBenchmark·p0.00        sample               ≈ 10⁻⁵               ms/op
    MappingFrameworksPerformance.simpleTest:mapStructMapperSimpleBenchmark·p0.50        sample               ≈ 10⁻⁴               ms/op
    MappingFrameworksPerformance.simpleTest:mapStructMapperSimpleBenchmark·p0.90        sample               ≈ 10⁻⁴               ms/op
    MappingFrameworksPerformance.simpleTest:mapStructMapperSimpleBenchmark·p0.95        sample               ≈ 10⁻⁴               ms/op
    MappingFrameworksPerformance.simpleTest:mapStructMapperSimpleBenchmark·p0.99        sample               ≈ 10⁻⁴               ms/op
    MappingFrameworksPerformance.simpleTest:mapStructMapperSimpleBenchmark·p0.999       sample               ≈ 10⁻⁴               ms/op
    MappingFrameworksPerformance.simpleTest:mapStructMapperSimpleBenchmark·p0.9999      sample                0.002               ms/op
    MappingFrameworksPerformance.simpleTest:mapStructMapperSimpleBenchmark·p1.00        sample               10.207               ms/op
    MappingFrameworksPerformance.simpleTest:modelMapperBenchmark                        sample  1514916       0.001 ±     0.001   ms/op
    MappingFrameworksPerformance.simpleTest:modelMapperBenchmark·p0.00                  sample                0.001               ms/op
    MappingFrameworksPerformance.simpleTest:modelMapperBenchmark·p0.50                  sample                0.001               ms/op
    MappingFrameworksPerformance.simpleTest:modelMapperBenchmark·p0.90                  sample                0.001               ms/op
    MappingFrameworksPerformance.simpleTest:modelMapperBenchmark·p0.95                  sample                0.001               ms/op
    MappingFrameworksPerformance.simpleTest:modelMapperBenchmark·p0.99                  sample                0.001               ms/op
    MappingFrameworksPerformance.simpleTest:modelMapperBenchmark·p0.999                 sample                0.004               ms/op
    MappingFrameworksPerformance.simpleTest:modelMapperBenchmark·p0.9999                sample                0.035               ms/op
    MappingFrameworksPerformance.simpleTest:modelMapperBenchmark·p1.00                  sample                7.004               ms/op
    MappingFrameworksPerformance.simpleTest:orikaMapperSimpleBenchmark                  sample  1080540      ≈ 10⁻³               ms/op
    MappingFrameworksPerformance.simpleTest:orikaMapperSimpleBenchmark·p0.00            sample               ≈ 10⁻⁴               ms/op
    MappingFrameworksPerformance.simpleTest:orikaMapperSimpleBenchmark·p0.50            sample               ≈ 10⁻³               ms/op
    MappingFrameworksPerformance.simpleTest:orikaMapperSimpleBenchmark·p0.90            sample               ≈ 10⁻³               ms/op
    MappingFrameworksPerformance.simpleTest:orikaMapperSimpleBenchmark·p0.95            sample               ≈ 10⁻³               ms/op
    MappingFrameworksPerformance.simpleTest:orikaMapperSimpleBenchmark·p0.99            sample               ≈ 10⁻³               ms/op
    MappingFrameworksPerformance.simpleTest:orikaMapperSimpleBenchmark·p0.999           sample                0.002               ms/op
    MappingFrameworksPerformance.simpleTest:orikaMapperSimpleBenchmark·p0.9999          sample                0.026               ms/op
    MappingFrameworksPerformance.simpleTest:orikaMapperSimpleBenchmark·p1.00            sample               15.958               ms/op
    MappingFrameworksPerformance.simpleTest:selmaMapperSimpleBenchmark                  sample  1390337      ≈ 10⁻⁴               ms/op
    MappingFrameworksPerformance.simpleTest:selmaMapperSimpleBenchmark·p0.00            sample               ≈ 10⁻⁵               ms/op
    MappingFrameworksPerformance.simpleTest:selmaMapperSimpleBenchmark·p0.50            sample               ≈ 10⁻⁴               ms/op
    MappingFrameworksPerformance.simpleTest:selmaMapperSimpleBenchmark·p0.90            sample               ≈ 10⁻⁴               ms/op
    MappingFrameworksPerformance.simpleTest:selmaMapperSimpleBenchmark·p0.95            sample               ≈ 10⁻⁴               ms/op
    MappingFrameworksPerformance.simpleTest:selmaMapperSimpleBenchmark·p0.99            sample               ≈ 10⁻⁴               ms/op
    MappingFrameworksPerformance.simpleTest:selmaMapperSimpleBenchmark·p0.999           sample               ≈ 10⁻⁴               ms/op
    MappingFrameworksPerformance.simpleTest:selmaMapperSimpleBenchmark·p0.9999          sample                0.002               ms/op
    MappingFrameworksPerformance.simpleTest:selmaMapperSimpleBenchmark·p1.00            sample                8.765               ms/op
    MappingFrameworksPerformance.simpleTest:simpleTest·p0.00                            sample               ≈ 10⁻⁵               ms/op
    MappingFrameworksPerformance.simpleTest:simpleTest·p0.50                            sample               ≈ 10⁻⁴               ms/op
    MappingFrameworksPerformance.simpleTest:simpleTest·p0.90                            sample                0.001               ms/op
    MappingFrameworksPerformance.simpleTest:simpleTest·p0.95                            sample                0.001               ms/op
    MappingFrameworksPerformance.simpleTest:simpleTest·p0.99                            sample                0.001               ms/op
    MappingFrameworksPerformance.simpleTest:simpleTest·p0.999                           sample                0.002               ms/op
    MappingFrameworksPerformance.simpleTest:simpleTest·p0.9999                          sample                0.013               ms/op
    MappingFrameworksPerformance.simpleTest:simpleTest·p1.00                            sample               15.958               ms/op
    MappingFrameworksPerformance.realLifeTest                                               ss        5       9.427 ±    73.997   ms/op
    MappingFrameworksPerformance.realLifeTest:dozerMapperRealLifeBenchmark                  ss        5      16.168 ±   118.859   ms/op
    MappingFrameworksPerformance.realLifeTest:jmapperRealLifeBenchmark                      ss        5       0.387 ±     3.073   ms/op
    MappingFrameworksPerformance.realLifeTest:mapStructRealLifeMapperBenchmark              ss        5       0.870 ±     7.279   ms/op
    MappingFrameworksPerformance.realLifeTest:modelMapperRealLifeBenchmark                  ss        5      16.903 ±   130.034   ms/op
    MappingFrameworksPerformance.realLifeTest:orikaMapperRealLifeBenchmark                  ss        5      21.078 ±   175.103   ms/op
    MappingFrameworksPerformance.realLifeTest:selmaRealLifeMapperBenchmark                  ss        5       1.157 ±     9.678   ms/op
    MappingFrameworksPerformance.simpleTest                                                 ss        5       2.697 ±    22.728   ms/op
    MappingFrameworksPerformance.simpleTest:dozerMapperSimpleBenchmark                      ss        5       7.106 ±    59.917   ms/op
    MappingFrameworksPerformance.simpleTest:jmapperSimpleBenchmark                          ss        5       0.034 ±     0.253   ms/op
    MappingFrameworksPerformance.simpleTest:mapStructMapperSimpleBenchmark                  ss        5       0.495 ±     4.223   ms/op
    MappingFrameworksPerformance.simpleTest:modelMapperBenchmark                            ss        5       4.021 ±    33.492   ms/op
    MappingFrameworksPerformance.simpleTest:orikaMapperSimpleBenchmark                      ss        5       3.575 ±    30.322   ms/op
    MappingFrameworksPerformance.simpleTest:selmaMapperSimpleBenchmark                      ss        5       0.951 ±     8.163   ms/op
