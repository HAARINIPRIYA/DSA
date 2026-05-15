/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */
int sumNumbers(struct TreeNode* root) {
    if(root==NULL){
        return 0;
    }
    if(root->left==NULL && root->right==NULL){
        return root->val;
    }
    int leftSum=0,rightSum=0;
    if(root->left){
        root->left->val+=root->val*10;
        leftSum=sumNumbers(root->left);
    }
    if(root->right){
        root->right->val+=root->val*10;
        rightSum=sumNumbers(root->right);
    }
    return leftSum+rightSum;

}