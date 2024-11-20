package com.directi.training.ocp.exercise_refactored;

public class ResourceAllocator {
    private static final int INVALID_RESOURCE_ID = -1;

    public int allocate(Resource resource)
    {
        if (!resource.isFree()) {
            System.out.println("ERROR: Resource is not free.");
            return INVALID_RESOURCE_ID;
        }

        int resourceId = resource.findFree();
        resource.markBusy(resourceId);
        return resourceId;
    }

    public void free(Resource resource, int resourceId)
    {
        resource.markFree(resourceId);
    }
}