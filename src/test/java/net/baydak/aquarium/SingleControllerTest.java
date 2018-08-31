package net.baydak.aquarium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class SingleControllerTest {
    @Mock
    private Landscape landscape;
    @InjectMocks
    SingleController sut;

    @Test
    public void index() {
    }

    @Test
    public void sum() {
    }
}