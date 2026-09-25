class MyQueue {
    int s1[100], s2[100];
    int top1 = -1, top2 = -1;

public:
    MyQueue() {
    }

    void push(int x) {
        s1[++top1] = x;
    }

    int pop() {
        if (top2 == -1) {
            while (top1 != -1)
                s2[++top2] = s1[top1--];
        }

        return s2[top2--];
    }

    int peek() {
        if (top2 == -1) {
            while (top1 != -1)
                s2[++top2] = s1[top1--];
        }

        return s2[top2];
    }

    bool empty() {
        return top1 == -1 && top2 == -1;
    }
};