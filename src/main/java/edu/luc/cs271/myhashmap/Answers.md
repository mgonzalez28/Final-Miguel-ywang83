# Questions & Answers

## Try using a `TreeMap` and a `HashMap` instead of `MyHashMap`.
- Are the resulting word frequencies any different?

1. `MyHashMap` result <br>
time in ms: 4012 <br>
the=33194 <br>
of=17956 <br>
and=12614 <br>
a=12346 <br>
to=12233 <br>
in=9232 <br>
was=7542 <br>
that=6278 <br>
he=5955 <br>
his=5496 <br>

2. `TreeMap` result <br>
time in ms: 4395 <br>
10 most frequent words and their frequencies are same as above.  <br>

3. `HashMap` result <br>
time in ms: 3351 <br>
10 most frequent words and their frequencies are same as above. <br>

- Is the time performance any different? If so, how would you rank the three implementations (in increasing order of time complexity)? <br>
Yes. Time Cost (in increasing order of time complexity):  `HashMap` < `MyHashMap` < `TreeMap` .

##  How are `%` and `Math.floorMod` different? Which works more reliably for computing a hash table index?

## What is the time complexity of `MyHashMap.size()`, and how could you make it much more efficient?

## How does this implementation compare to one where you would directly use your linked `Node` class from the earlier assignment? Answer briefly in terms of ease of implementation, correctness, reliability, and performance.


