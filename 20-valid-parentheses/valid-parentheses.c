int isValid(char* s) {
    char stack[100000];
    int top = -1;

    for (int i = 0; s[i] != '\0'; i++) {
        char ch = s[i];

        // If opening bracket → push
        if (ch == '(' || ch == '{' || ch == '[') {
            stack[++top] = ch;
        }
        // If closing bracket
        else if (ch == ')' || ch == '}' || ch == ']') {
            // Stack empty → invalid
            if (top == -1)
                return 0;

            char open = stack[top--];

            // Check matching pair
            if ((ch == ')' && open != '(') ||
                (ch == '}' && open != '{') ||
                (ch == ']' && open != '[')) {
                return 0;
            }
        }
    }

    // If stack empty → valid
    return top == -1;
    }


