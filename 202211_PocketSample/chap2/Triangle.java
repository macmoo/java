package jp.wings.pocket.chap2;

public class Triangle
{
    float x;
    float y;
    float area;

    float getArea( float height, float bottom ) {
        return height * bottom / 2;
    }

    void getArea2( float height, float bottom ) {
        this.area = height * bottom / 2;
    }
}

