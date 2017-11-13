# Questions & Answers

##

http://grepcode.com/file/repository.grepcode.com/java/root/jdk/openjdk/6-b14/java/util/Map.java
https://docs.oracle.com/javase/6/docs/api/java/util/Map.html#put%28K,%20V%29

public static void main(final String[] args) throws InterruptedException {
        HashMap<String, Integer> fixture=new HashMap<>();
        Iterator it = Arrays.asList("hello", "world", "what", "up").iterator();

        int count = 0;
        while (it.hasNext()) {
            String temp= (String) it.next();
                fixture.put(temp, count);
                count++;
        }

        System.out.println(fixture.get("hello"));
        System.out.println(fixture.get("world"));
        System.out.println(fixture.get("what"));
    }