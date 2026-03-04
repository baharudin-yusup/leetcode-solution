function reverseWords(s: string): string {
    return s.trim()
        .split(" ")
        .filter((s) => s !== "")
        .reduce((acc, curr) => `${curr} ${acc}`, "")
        .trim();
};