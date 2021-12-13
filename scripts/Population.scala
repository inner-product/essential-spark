// This is intended to be used as a script within the Spark shell.
// You can load it using the command
//
//   :load scripts/Population.scala
//
// From the shell. Note: You will probably need to change the path to the file.
object Population {
  // Load the data into a DataFrame
  val df = spark.read
    .option("header", "true")
    .option("inferSchema", "true")
    .csv("../essential-spark/data/population.csv")

  // Exercises
  //
  // Basic questions
  //
  // How many rows are there in the DataFrame?
  // How many columns does the DataFrame have?
  // Are there any duplicated rows in the DataFrame?
  //
  //
  // Filtering
  //
  // How many different countries are represented?
  //
  // How many countries have population under 5 million in 2018?
  //
  // For each country for which there is data for 2018, get the name of the
  // country and its population as a proportion of China's in 2018.
  //
  //
  // Aggregation
  //
  // Which country has the highest population?
  //
  // Which country has the lowest population?
  //
  // Which country has the highest population in 1960?
  //
  // Which country has the lowest population in 2018?
  //
  //
  // Joins
  //
  // Which country had the largest absolute growth in population from one year to the next?
  //
  // Which country had the largest relative (percentage) growth in population from one year to the next?
  //
  // Which countries had population decline since 1980?
  //
  // Which are the ten smallest countries?
}
