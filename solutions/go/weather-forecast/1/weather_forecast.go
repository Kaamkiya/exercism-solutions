// Package weather provides weather-related functions.
package weather

// CurrentCondition is a string.
var CurrentCondition string
// CurrentLocation is a string.
var CurrentLocation string

// Forecast returns a weather forecast.
func Forecast(city, condition string) string {
	CurrentLocation, CurrentCondition = city, condition
	return CurrentLocation + " - current weather condition: " + CurrentCondition
}
