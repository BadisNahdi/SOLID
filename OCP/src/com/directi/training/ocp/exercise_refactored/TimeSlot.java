package com.directi.training.ocp.exercise_refactored;

public class TimeSlot extends Resource {
    public TimeSlot(int id)
    {
        super(id);
    }

    @Override
    public boolean isFree()
    {
        throw new UnsupportedOperationException("isFree");
    }

    @Override
    public void markBusy(int resourceId)
    {
        throw new UnsupportedOperationException("markBusy");
    }

    @Override
    public void markFree(int resourceId)
    {
        throw new UnsupportedOperationException("markFree");
    }

    @Override
    public int findFree()
    {
        throw new UnsupportedOperationException("findFree");
    }
}