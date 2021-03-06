package org.basex.query.iter;

import java.util.*;

import org.basex.query.value.item.*;
import org.basex.util.*;

/**
 * Basic iterator, throwing no exceptions.
 *
 * This class also implements the {@link Iterable} interface. Hence, all values can also be
 * retrieved via an enhanced for-loop. Using {@link #next()} is faster.
 *
 * @author BaseX Team 2005-18, BSD License
 * @author Christian Gruen
 * @param <I> generic item type
 */
public abstract class BasicIter<I extends Item> extends Iter implements Iterable<I> {
  /** Result size. */
  protected final long size;
  /** Current position. */
  protected long pos;

  /**
   * Constructor.
   * @param size size
   */
  public BasicIter(final long size) {
    this.size = size;
  }

  @Override
  public abstract I get(long i);

  @Override
  public I next() {
    final long p = pos++;
    return p < size ? get(p) : null;
  }

  @Override
  public final long size() {
    return size;
  }

  @Override
  public final Iterator<I> iterator() {
    return new Iterator<I>() {
      private I it;

      @Override
      public boolean hasNext() {
        it = BasicIter.this.next();
        return it != null;
      }
      @Override
      public I next() {
        return it;
      }
      @Override
      public void remove() {
        throw Util.notExpected();
      }
    };
  }
}
