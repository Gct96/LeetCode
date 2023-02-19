package Array;

import java.util.Iterator;

/**
 * 请你在设计一个迭代器，在集成现有迭代器拥有的 hasNext 和 next 操作的基础上，还额外支持 peek 操作。
 *
 * 实现 PeekingIterator 类：
 * PeekingIterator(Iterator<int> nums) 使用指定整数迭代器 nums 初始化迭代器。
 * int next() 返回数组中的下一个元素，并将指针移动到下个元素处。
 * bool hasNext() 如果数组中存在下一个元素，返回 true ；否则，返回 false 。
 * int peek() 返回数组中的下一个元素，但 不 移动指针。
 * 注意：每种语言可能有不同的构造函数和迭代器 Iterator，但均支持 int next() 和 boolean hasNext() 函数
 * @author keyboardhero
 * @create 2023-02-19 15:58
 */
public class _284_middle {
    class PeekingIterator implements Iterator<Integer>{
        //属性
        private Iterator<Integer> iterator;
        private Integer nextElement;
        //构造函数
        public PeekingIterator(Iterator<Integer> iterator) {
            this.iterator=iterator;
            nextElement = iterator.next();
        }

        // Returns the next element in the iteration without advancing the iterator.
        public Integer peek() {
            return nextElement;
        }

        // hasNext() and next() should behave the same as in the Iterator interface.
        // Override them if needed.
        @Override
        public Integer next() {
            //先存值
            Integer nextEle=nextElement;
            //再更新指针
            nextElement=iterator.hasNext()?iterator.next():null;
            return nextEle;
        }

        @Override
        public boolean hasNext() {
            return nextElement!=null;
        }
    }

}
