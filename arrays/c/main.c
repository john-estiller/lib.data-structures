#include <stdio.h>
#include <string.h>

// Define a structure to hold different data types
typedef struct {
    int type; // 0: int, 1: char*, 2: float
    union {
        int i_val;
        char *s_val;
        float f_val;
    } data;
} Element;

int main() {
    // Create a static array with a fixed size
    Element myArray[5]; 
    int size = 0; 

    // Add elements (different data types)
    Element intElement = {.type = 0, .data.i_val = 42};
    myArray[size++] = intElement;

    Element stringElement = {.type = 1, .data.s_val = "Hello"}; 
    myArray[size++] = stringElement;

    Element floatElement = {.type = 2, .data.f_val = 3.14f};
    myArray[size++] = floatElement;

    // Add a "null" element (represented as a string with value NULL)
    Element nullElement = {.type = 1, .data.s_val = NULL};
    myArray[size++] = nullElement;

    // Mutability: Modify an element
    // (Note: Modifying string literals directly is not recommended in general, 
    // but for this simple example, we'll modify the array element)
    myArray[1].data.s_val = "World!";  

    // Access and print elements
    for (int i = 0; i < size; i++) {
        switch (myArray[i].type) {
            case 0:
                printf("Integer: %d\n", myArray[i].data.i_val);
                break;
            case 1:
                printf("String: %s\n", myArray[i].data.s_val ? myArray[i].data.s_val : "NULL");
                break;
            case 2:
                printf("Float: %f\n", myArray[i].data.f_val);
                break;
        }
    }

    return 0;
}