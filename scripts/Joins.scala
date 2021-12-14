// This is intended to be used as a script within the Spark shell.
// You can load it using the command
//
//   :load scripts/Joins.scala
//
// from the shell. Note: You will probably need to change the path to the file.
object Joins {
  val population = spark.read
    .option("header", "true")
    .option("inferSchema", "true")
    .csv("../essential-spark/data/population.csv")

  // This is a big data file. Here are some of the more useful columns
  // - SpatialDimValueCode: ISO 3 character country code.
  // - Period: year from 1950 to 2019
  // - Dim1: Female, Male, Both sexes
  // - FactValueNumeric: mean infant mortality
  val mortality = spark.read
    .option("header", "true")
    .option("inferSchema", "true")
    .csv("../essential-spark/data/infant-mortality.csv")

  // Contains country codes and names 193 countries, which are the generally
  // agreed upon countries in the world.
  val countries = spark.read
    .option("header", "true")
    .option("inferSchema", "true")
    .csv("../essential-spark/data/countries.csv")

  // Join countries and population to get just country name and population for
  // all the actual countries, not the various regions etc. in population.

  // Join mortality on population to get just:
  // - country code
  // - country name
  // - year
  // - population
  // - mean infant mortality for both sexes

  // Join countries and population to get country name and population for
  // all the regions etc. that are not countries in population.

  // Find any countries or regions, or years, for which there is population data
  // but not infant mortality data

  // For each country find the year in which its population was a maximum
  // For each country find the year in which its populatino was a minimum
  // Find the countries that have their maximum population occur before their minimum
}
