struct ListNode {
    int val;
    struct ListNode *next;
};

struct ListNode* addTwoNumbers(struct ListNode* l1, struct ListNode* l2) {
    int i = 0;
    int j = 0;
    int rem = 0;
    struct ListNode* reLN;
    while(l1 != 0 || l2 != 0 || rem != 0){
        int sum = (l1 == 0 ? l1.val: 0) + (l2 == 0 ? l2.val: 0) + rem;
        int digit = sum % 10;
        rem = sum / 10;
    }

    
    return reLN;
}
