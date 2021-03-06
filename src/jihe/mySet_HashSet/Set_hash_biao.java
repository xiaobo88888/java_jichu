package jihe.mySet_HashSet;
/*
* 哈希表：是数组+链表实现的
*
* 加入给你六个字符串，让你存储到哈希表中
* hello
* world
* java
* world
* 通话
* 重地
*
* 给你一个数组长度为16的数组（hashSet集合的无参构造方法默认初始容量为16）
* 0      1        2          3       。。。          15
*
* 先计算存储的元素的哈希值
* hello 99162322
 * world 113318802
 * java  3254818
 * world 113318802
 * 通话   1179395
 * 重地   1179395
 *
 * 在用元素的哈希值%16来判断存储位置
 * hello 99162322  % 16 = 2
 * world 113318802 % 16 = 2
 * java  3254818   % 16 = 2
 * world 113318802 % 16 = 2
 * 通话   1179395   % 16 = 3
 * 重地   1179395   % 16 = 3
 *
 *
 * 然后按照哈希表存储的流程添加元素
 *      先判断存储的位置有没有元素
 *          如果没有，则直接存入
 *          如果有，则判断要插入的元素的哈希值和该位置上所有元素的哈希值是否相等
 *              如果全不相等，则直接存入
 *              如果有相等的，则判断内容是否一致
 *                  如果内容不一致，则直接存入
 *                  如果内容一致，则元素重复，不存入
 *
 * 所以最终的存储结果为：
 *       0      1        2          3       。。。          15      //这是个数组
 *                       ↓          ↓                              //↓表示链表
 *                     hello       通话
 *                       ↓          ↓
 *                     world       重地
 *                       ↓
 *                     java*/
public class Set_hash_biao {

}
