class RecentCounter {
    tArray: number[];
    lastIndex: number;

    constructor() {
        this.tArray = [];
        this.lastIndex = 0;   
    }

    ping(t: number): number {
        this.tArray.push(t);

        while (this.tArray[this.lastIndex] < t - 3000) {
            this.lastIndex++;
        }

        return this.tArray.length - this.lastIndex;
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * var obj = new RecentCounter()
 * var param_1 = obj.ping(t)
 */