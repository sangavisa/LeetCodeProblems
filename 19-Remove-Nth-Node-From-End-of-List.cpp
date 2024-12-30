/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* removeNthFromEnd(ListNode* head, int n) {
     ListNode *dummy = new ListNode();
     dummy -> next = head;
     ListNode *fst = dummy;
     ListNode *lst = dummy;

     int cnt = 0;
     while (cnt<n){
        fst = fst -> next;
        cnt++;
     }
     while (fst -> next != NULL){
        fst= fst -> next;
        lst = lst -> next;
     }
     lst -> next = lst ->  next-> next;
     return dummy -> next;  
    }
};