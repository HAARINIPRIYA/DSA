class Solution(object):
    def groupAnagrams(self, strs):
        d = {}
        for s in strs:
            freq = [0] * 26
            for ch in s:
                freq[ord(ch) - ord('a')] += 1
            key = tuple(freq)
            if key not in d:
                d[key] = []
            d[key].append(s)
        return list(d.values())
