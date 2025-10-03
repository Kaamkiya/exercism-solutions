package lasagna

func PreparationTime(layers []string, avgTime int) int {
    if avgTime == 0 {
        avgTime = 2
    }
    return len(layers) * avgTime
}

func Quantities(layers []string) (noodles int, sauce float64) {
    noodleLayerCount := 0
    sauceLayerCount := 0.0

    for _, layer := range layers {
        if layer == "noodles" {
            noodleLayerCount++
        }
        if layer == "sauce" {
            sauceLayerCount++
        }
    }
    
    return noodleLayerCount * 50, sauceLayerCount * 0.2
}

// TODO: define the 'AddSecretIngredient()' function
func AddSecretIngredient(friend []string, mine []string) {
    mine[len(mine)-1] = friend[len(friend)-1]
}

// TODO: define the 'ScaleRecipe()' function
func ScaleRecipe(amounts []float64, portions int) (ret []float64) {
    for _, a := range amounts {
        ret = append(ret, (a/2) * float64(portions))
    }

    return
}

// Your first steps could be to read through the tasks, and create
// these functions with their correct parameter lists and return types.
// The function body only needs to contain `panic("")`.
// 
// This will make the tests compile, but they will fail.
// You can then implement the function logic one by one and see
// an increasing number of tests passing as you implement more 
// functionality.
