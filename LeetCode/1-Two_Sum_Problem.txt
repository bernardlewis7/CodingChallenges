/*
*	Q. Given an array of integers, return indices of the two numbers such that they add up to a specific target.
*   You may assume that each input would have exactly one solution, and you may not use the same element twice.
*
*	Example:
*
*	Given nums = [2, 7, 11, 15], target = 9,
*
*	Because nums[0] + nums[1] = 2 + 7 = 9,
*	return [0, 1].
*
*
*/

class Solution
{
public:
  vector < int >twoSum (vector < int >&nums, int target)
  {

    vector < int >indices;
      vector < int >copy_nums;
      copy (nums.begin (), nums.end (), back_inserter (copy_nums));
      sort (copy_nums.begin (), copy_nums.end ());
    int s = 0, l = copy_nums.size () - 1;
    int actual = 0, flag = 0;
    int index1 = NULL, index2 = NULL;
    while (s < l)
      {
    actual = copy_nums[s] + copy_nums[l];
    cout << endl << s << l << " " << copy_nums[s] << " " << copy_nums[l]
      << endl;
    if (actual == target)
      {
        for (int i = 0; i < nums.size (); i++)
          {
        if (copy_nums[s] == nums[i])
          {
            index1 = i;
            cout << endl << "index1 " << i << endl;
          }
          }
        for (int j = 0; j < nums.size (); j++)
          {

        if (copy_nums[l] == nums[j] && j != index1)
          {
            index2 = j;
            cout << endl << "index2 " << j << endl;
          }
          }

        if (index1 < index2)
          {
        indices.push_back (index1);
        indices.push_back (index2);
          }
        else
          {
        indices.push_back (index2);
        indices.push_back (index1);
          }

        return indices;
      }
    else if (actual > target)
      l--;
    else if (actual < target)
      s++;

      }

    indices.push_back (NULL);
    return indices;

  }
};
