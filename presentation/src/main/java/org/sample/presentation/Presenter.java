// Copyright (c) 1998-2018 Core Solutions Limited. All rights reserved.
// ============================================================================
// CURRENT VERSION CNT.6.0
// ============================================================================
// CHANGE LOG
// CNT.6.0 : 2018-XX-XX, jam.hsu, creation
// ============================================================================

package org.sample.presentation;

/**
 * @author jam.hsu
 *
 */
public interface Presenter<V extends View<?>> {
    V createView();
}
