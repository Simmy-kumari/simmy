#include<stdio.h>
#include<stdlib.h>

struct node {
    int sum;
    struct node* Include;
    struct node* Exclude;
};

struct node* create(int sum) {
    struct node *new_node = (struct node*)malloc(sizeof(struct node));
    new_node->sum = sum;
    new_node->Include = NULL;
    new_node->Exclude = NULL;
    return new_node;
}
// Insert branches for including and excluding an element at 'index'
void insert(struct node *root, int *arr, int n, int index) {
    if (index == n) {
        return; 
    }
    root->Include = create(root->sum + arr[index]);
    root->Exclude = create(root->sum);

    insert(root->Include, arr, n, index + 1);
    insert(root->Exclude, arr, n, index + 1);
}
// Recursive function to find if any subset sums up to 'targetSum'
int find_subset_sums(struct node *root, int targetSum) {
    if (root == NULL) {
        return 0;
    }
    if (root->sum == targetSum) {
        return 1;
    }

    return find_subset_sums(root->Include, targetSum) || find_subset_sums(root->Exclude, targetSum);
}

int main() {
    int arr[] = {10, 30, 40, 50};
    int n = sizeof(arr) / sizeof(arr[0]);
    int targetSum = 80; 

    struct node *root = create(0);

    insert(root, arr, n, 0);

    printf("Searching for paths with sum = %d\n", targetSum);
    if (find_subset_sums(root, targetSum)) {
        printf("Yes, there is a subset with sum %d.\n", targetSum);
    } else {
        printf("No subset found with sum %d.\n", targetSum);
    }

    return 0;
}
