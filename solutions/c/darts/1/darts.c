#include <math.h>
#include <stdint.h>
#include "darts.h"

uint8_t score(coordinate_t pos) {
    float distance = hypot(pos.x, pos.y);

    if (distance <= 1.0F) return 10;
    if (distance <= 5.0F) return 5;
    if (distance <= 10.0F) return 1;
    
    return 0;
}