package com.kibong.designpatternsstudy.behavioral_patterns.iterator.simple;

import com.kibong.designpatternsstudy.behavioral_patterns.iterator.before.Post;

import java.util.Iterator;
import java.util.List;

public class RecentPostIterator implements Iterator<Post> {

    Iterator<Post> internalIterator;

    public RecentPostIterator(List<Post> postList) {
        postList.sort((p1, p2) -> p2.getCreatedDateTime().compareTo(p1.getCreatedDateTime()));
        this.internalIterator = postList.iterator();
    }

    @Override
    public boolean hasNext() {
        return internalIterator.hasNext();
    }

    @Override
    public Post next() {
        return internalIterator.next();
    }
}
