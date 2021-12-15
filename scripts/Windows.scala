object Windows {
  // Calculate
  // - moving average population using a window of 5 previous years
  // - year on year growth in population
  val population = spark.read
    .option("header", "true")
    .option("inferSchema", "true")
    .csv("../essential-spark/data/population.csv")
}
