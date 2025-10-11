#include <math.h>
#include "grains.h"

uint64_t square(uint8_t index) {
    if (index > 64 || index == 0) {
        return 0;
    }

    uint64_t amount = 1;
    return (amount << (index - 1));
}

uint64_t total(void) {
    uint64_t amount = 0;
    for (int i = 0; i <= 64; i++) amount += square(i);
    return amount;
}