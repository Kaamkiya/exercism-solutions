#include "dnd_character.h"

#include <time.h>
#include <stdlib.h>
#include <math.h>

int ability(void) {
    srand(time(NULL));
    return rand() % 15 + 3;
}

int modifier(int score) {
    return floor((score - 10) / 2.0);
}

dnd_character_t make_dnd_character(void) {
    dnd_character_t c;
    c.strength = ability();
    c.dexterity = ability();
    c.constitution = ability();
    c.intelligence = ability();
    c.wisdom = ability();
    c.charisma = ability();
    c.hitpoints = modifier(c.constitution) + 10;
    return c;
}