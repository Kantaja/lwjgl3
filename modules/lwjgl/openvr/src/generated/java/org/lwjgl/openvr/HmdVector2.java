/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openvr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct HmdVector2_t {
 *     float v[2];
 * }</code></pre>
 */
@NativeType("struct HmdVector2_t")
public class HmdVector2 extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        V;

    static {
        Layout layout = __struct(
            __array(4, 2)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        V = layout.offsetof(0);
    }

    /**
     * Creates a {@code HmdVector2} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public HmdVector2(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link FloatBuffer} view of the {@code v} field. */
    @NativeType("float[2]")
    public FloatBuffer v() { return nv(address()); }
    /** @return the value at the specified index of the {@code v} field. */
    public float v(int index) { return nv(address(), index); }

    /** Copies the specified {@link FloatBuffer} to the {@code v} field. */
    public HmdVector2 v(@NativeType("float[2]") FloatBuffer value) { nv(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code v} field. */
    public HmdVector2 v(int index, float value) { nv(address(), index, value); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public HmdVector2 set(HmdVector2 src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code HmdVector2} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static HmdVector2 malloc() {
        return wrap(HmdVector2.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code HmdVector2} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static HmdVector2 calloc() {
        return wrap(HmdVector2.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code HmdVector2} instance allocated with {@link BufferUtils}. */
    public static HmdVector2 create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(HmdVector2.class, memAddress(container), container);
    }

    /** Returns a new {@code HmdVector2} instance for the specified memory address. */
    public static HmdVector2 create(long address) {
        return wrap(HmdVector2.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static HmdVector2 createSafe(long address) {
        return address == NULL ? null : wrap(HmdVector2.class, address);
    }

    /**
     * Returns a new {@link HmdVector2.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static HmdVector2.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link HmdVector2.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static HmdVector2.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link HmdVector2.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static HmdVector2.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link HmdVector2.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static HmdVector2.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static HmdVector2.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code HmdVector2} instance allocated on the thread-local {@link MemoryStack}. */
    public static HmdVector2 mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code HmdVector2} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static HmdVector2 callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code HmdVector2} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static HmdVector2 mallocStack(MemoryStack stack) {
        return wrap(HmdVector2.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code HmdVector2} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static HmdVector2 callocStack(MemoryStack stack) {
        return wrap(HmdVector2.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link HmdVector2.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static HmdVector2.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link HmdVector2.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static HmdVector2.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link HmdVector2.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static HmdVector2.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link HmdVector2.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static HmdVector2.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #v}. */
    public static FloatBuffer nv(long struct) { return memFloatBuffer(struct + HmdVector2.V, 2); }
    /** Unsafe version of {@link #v(int) v}. */
    public static float nv(long struct, int index) {
        return UNSAFE.getFloat(null, struct + HmdVector2.V + check(index, 2) * 4);
    }

    /** Unsafe version of {@link #v(FloatBuffer) v}. */
    public static void nv(long struct, FloatBuffer value) {
        if (CHECKS) { checkGT(value, 2); }
        memCopy(memAddress(value), struct + HmdVector2.V, value.remaining() * 4);
    }
    /** Unsafe version of {@link #v(int, float) v}. */
    public static void nv(long struct, int index, float value) {
        UNSAFE.putFloat(null, struct + HmdVector2.V + check(index, 2) * 4, value);
    }

    // -----------------------------------

    /** An array of {@link HmdVector2} structs. */
    public static class Buffer extends StructBuffer<HmdVector2, Buffer> implements NativeResource {

        private static final HmdVector2 ELEMENT_FACTORY = HmdVector2.create(-1L);

        /**
         * Creates a new {@code HmdVector2.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link HmdVector2#SIZEOF}, and its mark will be undefined.
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected HmdVector2 getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link FloatBuffer} view of the {@code v} field. */
        @NativeType("float[2]")
        public FloatBuffer v() { return HmdVector2.nv(address()); }
        /** @return the value at the specified index of the {@code v} field. */
        public float v(int index) { return HmdVector2.nv(address(), index); }

        /** Copies the specified {@link FloatBuffer} to the {@code v} field. */
        public HmdVector2.Buffer v(@NativeType("float[2]") FloatBuffer value) { HmdVector2.nv(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code v} field. */
        public HmdVector2.Buffer v(int index, float value) { HmdVector2.nv(address(), index, value); return this; }

    }

}