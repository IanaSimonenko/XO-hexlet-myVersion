package io.hexlet.xo.model.controllers;

import io.hexlet.xo.model.Field;
import io.hexlet.xo.model.Figure;
import io.hexlet.xo.model.exceptions.InvalidPointException;
import io.hexlet.xo.model.exceptions.PointAlreadyOccupaiedException;

import java.awt.*;

public class MoveController {

    public void applyFigure(final Point point,
                            final Field field,
                            final Figure figure) throws InvalidPointException,
                                                 PointAlreadyOccupaiedException {

        if (field.getFigure(point) != null) {
            throw new PointAlreadyOccupaiedException();
        }

        field.setFigure(point, figure);

    }

}
