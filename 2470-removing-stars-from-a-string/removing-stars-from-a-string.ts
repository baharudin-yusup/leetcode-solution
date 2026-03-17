function removeStars(s: string): string {
    let stacks = [];

    for (const c of s) {
        if (c == "*") {
            stacks.pop();
        } else {
            stacks.push(c);
        }
    }

    return stacks.join("");
};