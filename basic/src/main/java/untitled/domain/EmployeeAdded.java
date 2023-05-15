package untitled.domain;

import java.util.*;
import lombok.*;
import untitled.domain.*;
import untitled.infra.AbstractEvent;

@Data
@ToString
public class EmployeeAdded extends AbstractEvent {

    private Long id;
    private String userId;
    private Boolean isManager;
    private DepartmentId departmentId;
    private RankId rankId;

    public EmployeeAdded(Employee aggregate) {
        super(aggregate);
    }

    public EmployeeAdded() {
        super();
    }
}
