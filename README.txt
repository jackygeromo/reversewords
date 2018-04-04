Interview Question: Given an input string, reverse the string word by word.  A word is defined as a sequence of non-space characters.  The input string does not contain leading or trailing spaces and the words are always separated by a single space.

This can be done in O(1) space.
An in-place algorithm operates directly on its input and changes it, instead of creating and returning a new object. This is sometimes called destructive, since the original input is "destroyed" when it's edited to create the new output.
Careful: "In-place" does not mean "without creating any additional variables!" Rather, it means "without creating a new copy of the input."
But be careful: an in-place algorithm can cause side effects. Your input is "destroyed" or "altered," which can affect code outside of your method.

This can be accomplished in O(n) time. We swap the characters from left and right positions.