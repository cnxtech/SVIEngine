/*
 * Copyright (C) 2011 SVI.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.github.sviengine.basetype;


/**
 * SVIPoint Class
 * SVIPoint has X, Y two elements.
 */
public class SVIPoint {

	/**
	 * default constructor
	 */
	public SVIPoint() {
		mX = 0;
		mY = 0;
	}

	/**
	 * constructor use x, y
	 *
	 * @param x > float x value
	 * @param y > float y value
	 */
	public SVIPoint(float x, float y) {
		mX = x;
		mY = y;
	}

	public float mX;
	public float mY;

}